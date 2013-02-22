package com.apress.prospring2.ch11.util;

import com.apress.prospring2.mock.TestUtils;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.naming.NamingException;

/**
 * @author janm
 */
public abstract class DaoDemoUtils {
    
    public static void buildJndi() {
        try {
            TestUtils.NamingContextBuilder builder;
            builder = TestUtils.NamingContextBuilder.emptyActivatedContextBuilder();

            String connectionString = "jdbc:oracle:thin:@localhost:1521:xe";
            builder.bind("java:comp/env/jdbc/prospring2/ch11", new DriverManagerDataSource(
                    "oracle.jdbc.driver.OracleDriver", connectionString, "PROSPRING", "x******6"));
        } catch (NamingException e) {
            // noop
        }
    }

}
