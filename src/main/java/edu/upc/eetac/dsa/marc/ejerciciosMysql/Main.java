package edu.upc.eetac.dsa.marc.ejerciciosMysql;

import edu.upc.eetac.dsa.marc.ejerciciosMysql.MysqlAccess;
import edu.upc.eetac.dsa.marc.ejerciciosMysql.MysqlPieces;

public class Main {
  public static void main(String[] args) throws Exception {
    MysqlPieces dao = new MysqlPieces();
    dao.readDataBase();
  }

} 