public JDBCPieDataset(String url, String driverName, String user, String password) throws SQLException, ClassNotFoundException { [EOL]     Class.forName(driverName); [EOL]     this.connection = DriverManager.getConnection(url, user, password); [EOL] } <line_num>: 100,108
public JDBCPieDataset(Connection con) { [EOL]     if (con == null) { [EOL]         throw new NullPointerException("A connection must be supplied."); [EOL]     } [EOL]     this.connection = con; [EOL] } <line_num>: 117,122
public JDBCPieDataset(Connection con, String query) throws SQLException { [EOL]     this(con); [EOL]     executeQuery(query); [EOL] } <line_num>: 135,138
public void executeQuery(String query) throws SQLException { [EOL]     executeQuery(this.connection, query); [EOL] } <line_num>: 151,153
public void executeQuery(Connection con, String query) throws SQLException { [EOL]     Statement statement = null; [EOL]     ResultSet resultSet = null; [EOL]     try { [EOL]         statement = con.createStatement(); [EOL]         resultSet = statement.executeQuery(query); [EOL]         ResultSetMetaData metaData = resultSet.getMetaData(); [EOL]         int columnCount = metaData.getColumnCount(); [EOL]         if (columnCount != 2) { [EOL]             throw new SQLException("Invalid sql generated.  PieDataSet requires 2 columns only"); [EOL]         } [EOL]         int columnType = metaData.getColumnType(2); [EOL]         double value = Double.NaN; [EOL]         while (resultSet.next()) { [EOL]             Comparable key = resultSet.getString(1); [EOL]             switch(columnType) { [EOL]                 case Types.NUMERIC: [EOL]                 case Types.REAL: [EOL]                 case Types.INTEGER: [EOL]                 case Types.DOUBLE: [EOL]                 case Types.FLOAT: [EOL]                 case Types.DECIMAL: [EOL]                 case Types.BIGINT: [EOL]                     value = resultSet.getDouble(2); [EOL]                     setValue(key, value); [EOL]                     break; [EOL]                 case Types.DATE: [EOL]                 case Types.TIME: [EOL]                 case Types.TIMESTAMP: [EOL]                     Timestamp date = resultSet.getTimestamp(2); [EOL]                     value = date.getTime(); [EOL]                     setValue(key, value); [EOL]                     break; [EOL]                 default: [EOL]                     System.err.println("JDBCPieDataset - unknown data type"); [EOL]                     break; [EOL]             } [EOL]         } [EOL]         fireDatasetChanged(new DatasetChangeInfo()); [EOL]     } finally { [EOL]         if (resultSet != null) { [EOL]             try { [EOL]                 resultSet.close(); [EOL]             } catch (Exception e) { [EOL]                 System.err.println("JDBCPieDataset: swallowing exception."); [EOL]             } [EOL]         } [EOL]         if (statement != null) { [EOL]             try { [EOL]                 statement.close(); [EOL]             } catch (Exception e) { [EOL]                 System.err.println("JDBCPieDataset: swallowing exception."); [EOL]             } [EOL]         } [EOL]     } [EOL] } <line_num>: 167,238
public void close() { [EOL]     try { [EOL]         this.connection.close(); [EOL]     } catch (Exception e) { [EOL]         System.err.println("JdbcXYDataset: swallowing exception."); [EOL]     } [EOL] } <line_num>: 244,251
