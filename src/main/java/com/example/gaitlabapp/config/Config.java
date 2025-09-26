package com.example.gaitlabapp.config;

import lombok.Data;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
@Data
@EnableJpaRepositories
public class Config {

    @Bean
    public DataSource dataSource(){
        return DataSourceBuilder.create()
//                .url("jdbc:sqlserver://NEMGLASQL001\\SQLSERVER:1433;database=gaitData; integratedSecurity = true; trustServerCertificate=true;")
                .url("jdbc:postgresql://127.0.0.1:5432/postgres")
                .build();
    }

    public Connection getDBConnection() throws SQLException {

        String url = "jdbc:postgresql://localhost:5432/postgres";
//        try{
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            DriverManager.setLoginTimeout(1000);
//            return DriverManager.getConnection("jdbc:sqlserver://NEMGLASQL001\\SQLSERVER:1433;database=gaitData; integratedSecurity = true; authenticationScheme=NativeAuthentication;");
//        } catch (ClassNotFoundException | SQLException e) {
//            throw new RuntimeException(e);
//        }
       return DriverManager.getConnection(url);
    }

}
