package Users;

import java.sql.SQLException;

public class UsersDAOFactory {
private static UsersDAO dao;

private UsersDAOFactory() {}

public static UsersDAO getUsersDao() throws SQLException {if (dao==null) {
	dao = new UsersDAOImp();
	
}
return dao;
}

}