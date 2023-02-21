public JDBCCategoryDataset(String url, String driverName, String user, String passwd) throws ClassNotFoundException, SQLException { [EOL]     Class.forName(driverName); [EOL]     this.connection = DriverManager.getConnection(url, user, passwd); [EOL] } <line_num>: 122,130
public JDBCCategoryDataset(Connection connection) { [EOL]     if (connection == null) { [EOL]         throw new NullPointerException("A connection must be supplied."); [EOL]     } [EOL]     this.connection = connection; [EOL] } <line_num>: 137,142
public JDBCCategoryDataset(Connection connection, String query) throws SQLException { [EOL]     this(connection); [EOL]     executeQuery(query); [EOL] } <line_num>: 153,157
public boolean getTranspose() { [EOL]     return this.transpose; [EOL] } <line_num>: 165,167
public void setTranspose(boolean transpose) { [EOL]     this.transpose = transpose; [EOL] } <line_num>: 175,177
public void executeQuery(String query) throws SQLException { [EOL]     executeQuery(this.connection, query); [EOL] } <line_num>: 191,193
public void executeQuery(Connection con, String query) throws SQLException { [EOL]     Statement statement = null; [EOL]     ResultSet resultSet = null; [EOL]     try { [EOL]         statement = con.createStatement(); [EOL]         resultSet = statement.executeQuery(query); [EOL]         ResultSetMetaData metaData = resultSet.getMetaData(); [EOL]         int columnCount = metaData.getColumnCount(); [EOL]         if (columnCount < 2) { [EOL]             throw new SQLException("JDBCCategoryDataset.executeQuery() : insufficient columns " + "returned from the database."); [EOL]         } [EOL]         int i = getRowCount(); [EOL]         while (--i >= 0) { [EOL]             removeRow(i); [EOL]         } [EOL]         while (resultSet.next()) { [EOL]             Comparable rowKey = resultSet.getString(1); [EOL]             for (int column = 2; column <= columnCount; column++) { [EOL]                 Comparable columnKey = metaData.getColumnName(column); [EOL]                 int columnType = metaData.getColumnType(column); [EOL]                 switch(columnType) { [EOL]                     case Types.TINYINT: [EOL]                     case Types.SMALLINT: [EOL]                     case Types.INTEGER: [EOL]                     case Types.BIGINT: [EOL]                     case Types.FLOAT: [EOL]                     case Types.DOUBLE: [EOL]                     case Types.DECIMAL: [EOL]                     case Types.NUMERIC: [EOL]                     case Types.REAL: [EOL]                         { [EOL]                             Number value = (Number) resultSet.getObject(column); [EOL]                             if (this.transpose) { [EOL]                                 setValue(value, columnKey, rowKey); [EOL]                             } else { [EOL]                                 setValue(value, rowKey, columnKey); [EOL]                             } [EOL]                             break; [EOL]                         } [EOL]                     case Types.DATE: [EOL]                     case Types.TIME: [EOL]                     case Types.TIMESTAMP: [EOL]                         { [EOL]                             Date date = (Date) resultSet.getObject(column); [EOL]                             Number value = new Long(date.getTime()); [EOL]                             if (this.transpose) { [EOL]                                 setValue(value, columnKey, rowKey); [EOL]                             } else { [EOL]                                 setValue(value, rowKey, columnKey); [EOL]                             } [EOL]                             break; [EOL]                         } [EOL]                     case Types.CHAR: [EOL]                     case Types.VARCHAR: [EOL]                     case Types.LONGVARCHAR: [EOL]                         { [EOL]                             String string = (String) resultSet.getObject(column); [EOL]                             try { [EOL]                                 Number value = Double.valueOf(string); [EOL]                                 if (this.transpose) { [EOL]                                     setValue(value, columnKey, rowKey); [EOL]                                 } else { [EOL]                                     setValue(value, rowKey, columnKey); [EOL]                                 } [EOL]                             } catch (NumberFormatException e) { [EOL]                             } [EOL]                             break; [EOL]                         } [EOL]                     default: [EOL]                         break; [EOL]                 } [EOL]             } [EOL]         } [EOL]         fireDatasetChanged(new DatasetChangeInfo()); [EOL]     } finally { [EOL]         if (resultSet != null) { [EOL]             try { [EOL]                 resultSet.close(); [EOL]             } catch (Exception e) { [EOL]             } [EOL]         } [EOL]         if (statement != null) { [EOL]             try { [EOL]                 statement.close(); [EOL]             } catch (Exception e) { [EOL]             } [EOL]         } [EOL]     } [EOL] } <line_num>: 208,318
