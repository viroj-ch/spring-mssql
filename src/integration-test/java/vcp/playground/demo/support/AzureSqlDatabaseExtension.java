package vcp.playground.demo.support;

import org.junit.ClassRule;
import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.testcontainers.containers.MSSQLServerContainer;

public class AzureSqlDatabaseExtension implements BeforeAllCallback, AfterAllCallback {

  @ClassRule
  private static MSSQLServerContainer azureSqlDatabaseContainer = TestAzureSqlDatabaseContainer.getInstance();

  @Override
  public void beforeAll(ExtensionContext context) {
    azureSqlDatabaseContainer.start();
  }

  @Override
  public void afterAll(ExtensionContext context) {
    azureSqlDatabaseContainer.stop();
  }
}
