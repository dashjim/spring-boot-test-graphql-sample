package com.farfetch.dragon.example.wechat.backend.client.queryAPI;

import com.farfetch.dragon.example.wechat.backend.client.api.ProductAPI;
import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;

import static graphql.GraphQL.newGraphQL;
import static graphql.schema.idl.RuntimeWiring.newRuntimeWiring;

/**
 * Created by jim.ji@farfetch.com on 2017/10/3.
 *
 */
@RestController
public class ProductQueryAPI {

    public static final Logger LOGGER = LoggerFactory.getLogger(ProductQueryAPI.class);

    @Value("classpath:product.graphqls")
    private Resource schemaResource;

    private GraphQL graphQL;

    @Autowired
    private ProductAPI productFetcher;

    @PostConstruct
    public void loadShema() throws IOException {
        File schemaFile = schemaResource.getFile();
        TypeDefinitionRegistry typeRegistry= new SchemaParser().parse(schemaFile);
        RuntimeWiring wiring = buildRuntimeWriting();
        GraphQLSchema schema = new SchemaGenerator().makeExecutableSchema(typeRegistry, wiring);
        graphQL = newGraphQL(schema).build();
    }

    private RuntimeWiring buildRuntimeWriting() {

        return newRuntimeWiring().type("Query", typeWiring -> typeWiring.dataFetcher("product", productFetcher))
                .build();
    }


    @PostMapping(path="/v1/query/pdp")
    public ResponseEntity query(@RequestBody String query){

        final ExecutionResult executeResult = graphQL.execute(query);
        LOGGER.error(String.valueOf(executeResult.getErrors()));

        return ResponseEntity.ok(executeResult.getData());
    }

}
