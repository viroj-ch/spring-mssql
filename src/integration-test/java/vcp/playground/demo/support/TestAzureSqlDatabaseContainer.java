package vcp.playground.demo.support;

import org.testcontainers.containers.MSSQLServerContainer;

public final class TestAzureSqlDatabaseContainer extends MSSQLServerContainer<TestAzureSqlDatabaseContainer> {

  private static TestAzureSqlDatabaseContainer container;

  private TestAzureSqlDatabaseContainer() {
    super();
  }

  public static TestAzureSqlDatabaseContainer getInstance() {
    synchronized (TestAzureSqlDatabaseContainer.class) {
      if (container == null) {
        container = new TestAzureSqlDatabaseContainer();
      }
      return container;
    }
  }

  @Override
  public void start() {
    super.start();
    System.setProperty("DB_URL", container.getJdbcUrl());
    System.setProperty("DB_DRIVER_CLASS_NAME", container.getDriverClassName());
    System.setProperty("DB_USERNAME", container.getUsername());
    System.setProperty("DB_PASSWORD", container.getPassword());
  }

  @Override
  public void stop() {
    // do nothing, JVM handles shut down
  }
}
