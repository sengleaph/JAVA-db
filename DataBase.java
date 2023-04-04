package JVDB;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataBase
{
    static int option;
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        DataSourceImp dataSourceImp = new DataSourceImp();
        Students students = new Students();
        Connection conn = DataSourceImp.dataSource().getConnection();


        do {
            System.out.println("==========> JDBC CRUD Operations <==========");
            System.out.println("1. Insert Your Database");
            System.out.println("2. Update Your Database");
            System.out.println("3. Delete Your Database");
            System.out.println("4. Select Your Database");
            System.out.println("5. Exist From Operation");
            System.out.println("=====Choose option from 1 - 5 =====");

            option = scanner.nextInt();
            switch (option){
                case 1 :

                    boolean isINSERTValid = false;
                    do {
                        System.out.println("======================= Insert Your Data =======================");
                        System.out.println("Enter ID:");
                        students.setId(scanner.nextInt());
                        System.out.println("Enter Name:");
                        students.setName(scanner.next());
                        System.out.println("Enter Gender:");
                        students.setGender(scanner.next());
                        System.out.println("Enter Age:");
                        students.setAge(scanner.nextInt());
                        System.out.println("Enter Score:");
                        students.setScore(scanner.nextFloat());

                        try {
                            String insert =  "INSERT INTO totopic (id ,name, gender, age, score )VALUES(?,?,?,?,?)";
                            PreparedStatement statement = conn.prepareStatement(insert);
                            statement.setInt(1, Students.getId());
                            statement.setString(2,students.getName());
                            statement.setString(3, students.getGender());
                            statement.setInt(4,students.getAge());
                            statement.setFloat(5, students.getScore());
                            statement.executeUpdate();
                            System.out.println("Successfully Inserted");
                            isINSERTValid = true;
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }while (!isINSERTValid);

                case 2 :

                    boolean isUpdateValid = false;
                    System.out.println("Input Your ID to Update:");
                    students.setId(scanner.nextInt());
                    do {
                        System.out.println("================== Update Your Database ==================");
                        System.out.println(">>>>1. Update ID ");
                        System.out.println(">>>>2. Update Name ");
                        System.out.println(">>>>3. Update Gender");
                        System.out.println(">>>>4. Update Age ");
                        System.out.println(">>>>5. Update score ");
                        System.out.println(">>>>6. Exist ");
                        option = scanner.nextInt();

                        switch (option){
                            case 1 :
                                System.out.println("====== Update ID ======");
                                try {
                                    Statement statement2 = conn.createStatement();

                                    String newID = "";
                                    String updateID = "UPDATE thetopic set id = '" + newID +"'WHERE id = '" + Students.getId()+"'";
                                    int upID = statement2.executeUpdate(updateID);
                                    if (upID > 0){
                                        isUpdateValid = true;
                                        System.out.println("ID Successfully Updated");}
                                    else
                                        System.out.println("Retry To Update ID Later!!!");
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }
                            case 2:
                                System.out.println("====== Update Name ======");
                                try {
                                    Statement statement3 = conn.createStatement();

                                    String newNAME = "";
                                    String updateName = "UPDATE thetopic set name = '" + newNAME +"'WHERE name = '" +Students.getName()+"'";
                                    int upUSER = statement3.executeUpdate(updateName);
                                    if (upUSER > 0){
                                        isUpdateValid = true;
                                        System.out.println("Username Successfully Updated");}
                                    else
                                        System.out.println("Retry To Update Username Later!!!");
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }
                            case 3:
                                System.out.println("====== Update Gender ======");
                                try {

                                    Statement statement4 = conn.createStatement();

                                    String newGender = "";
                                    String updateGender = "UPDATE thetopic set gender = '" + newGender +"'WHERE gender = '" +students.getGender()+"'";
                                    int upEMAIL = statement4.executeUpdate(updateGender);
                                    if (upEMAIL > 0){
                                        isUpdateValid = true;
                                        System.out.println("Gender Successfully Updated");}
                                    else
                                        System.out.println("Retry To Update Gender Later!!!");
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }
                            case 4:
                                System.out.println("====== Update Age  ======");
                                try {

                                    Statement statement5 = conn.createStatement();

                                    String newAge = "";
                                    String updateAge = "UPDATE thetopic set  = '" + newAge +"'WHERE age = '" +students.getAge()+"'";
                                    int upPWD = statement5.executeUpdate(updateAge);
                                    if (upPWD > 0){
                                        isUpdateValid = true;
                                        System.out.println("Age Successfully Updated");}
                                    else
                                        System.out.println("Retry To Update Age Later!!!");
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }
                            case 5:
                                System.out.println("====== Update score  ======");
                                try {

                                    Statement statement6 = conn.createStatement();

                                    String newScore = "";
                                    String updateScore = "UPDATE thetopic set  = '" + newScore +"'WHERE score = '" +students.getScore()+"'";
                                    int upPWD = statement6.executeUpdate(updateScore);
                                    if (upPWD > 0){
                                        isUpdateValid = true;
                                        System.out.println("Age Successfully Updated");}
                                    else
                                        System.out.println("Retry To Update Age Later!!!");
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }
                            case 6:
                                System.out.println("-----------------Exist------------------");
                        }

                    }while (!isUpdateValid);
                case 3 :

                    boolean isDeleteValid = false;
                    System.out.println("Input your ID to entry the Delete Operation:");
                    students.setId(scanner.nextInt());

                    do {
                        System.out.println("================= Delete Your Database ==================== ");
                        System.out.println(">>>>1. Delete by ID ");
                        System.out.println(">>>>2. Delete by Username ");
                        System.out.println(">>>>3. Exist ");
                        option = scanner.nextInt();
                        switch (option){
                            case 1:
                                System.out.println(">>>> Delete by ID <<<<");
                                try {
                                    Statement statement6 = conn.createStatement();

                                    String deleteID = new StringBuilder().append("DELETE from thetopic WHERE id = '").append(Students.getId()).append("' name = '").append(Students.getName()).append("' gender = '").append(Students.getGender()).append("'age = '").append(Students.getAge).append("'score = '").append(Students.getScore()).append("'").toString();
                                    int delID = statement6.executeUpdate(deleteID);
                                    if (delID > 0){
                                        isDeleteValid = true;
                                        System.out.println("One UserAccount Successfully Deleted");}
                                    else
                                        System.out.println("Retry again later!!!");
                                } catch (SQLException e) {
                                    throw new RuntimeException(e);
                                }
                            case 2:
                                System.out.println(">>>> Delete by Username <<<<");
                                try {
                                    Statement statement7 = conn.createStatement();

                                    String deleteID = "DELETE from thetopic WHERE name = '" + students.getName() +
                                            "' gender = '" + students.getGender() + "' age = '" +students.getAge()+
                                            "'id = '"+students.getId()+"'score = '"+students.getScore()+"'";
                                    int delUser = statement7.executeUpdate(deleteID);
                                    if (delUser > 0){
                                        isDeleteValid = true;
                                        System.out.println("One UserAccount Successfully Deleted");}
                                    else
                                        System.out.println("Retry again later!!!");
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }
                            case 3:  System.out.println("-----------------Exist------------------");
                        }
                    }while (!isDeleteValid);
                case 4 :

                    boolean isSelectValid = false;
                    do {
                        System.out.println("=================== Select Your Database =====================");
                        System.out.println(">>>>1. Select by ID ");
                        System.out.println(">>>>2. Select by Username ");
                        System.out.println(">>>>3. Select by All ");
                        System.out.println(">>>>4. Exist");
                        option = scanner.nextInt();

                        switch (option){
                            case 1:
                                System.out.println(">>>> Select by ID <<<<");
                                try {
                                    Statement statement8 = conn.createStatement();

                                    String selectID = "SELECT * FROM thetopic WHERE id = '"+students.getId()+"'";
                                    ResultSet rs = statement8.executeQuery(selectID);
                                    if (rs.next()) {
                                        isSelectValid = true;
                                        System.out.println("Your Database ID: " +rs.getInt("id"));
                                    }
                                    else
                                        System.out.println("No such User id is already registered");

                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }
                            case 2:
                                System.out.println(">>>> Select by Name <<<<");
                                try {
                                    Statement statement9 = conn.createStatement();

                                    String selectName = "SELECT * FROM thetopic WHERE name = '"+students.getId()+"'";
                                    ResultSet rs = statement9.executeQuery(selectName);
                                    if (rs.next()) {
                                        isSelectValid = true;
                                        System.out.println("Your Database Name: " +rs.getString("Name"));
                                    }
                                    else
                                        System.out.println("No such Username is already registered");

                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }
                            case 3:
                                System.out.println(">>>> Select ALL  <<<<");
                                try {
                                    String selectALL = "SELECT * FROM thetopic ";
                                    PreparedStatement preparedStatement = conn.prepareStatement(selectALL);
                                    ResultSet rs = preparedStatement.executeQuery(selectALL);
                                    List<Students> studentsList = new ArrayList<>();
                                    if (rs.next()) {
                                        isSelectValid = true;
                                        Integer id = rs.getInt("id");
                                        String name = rs.getString("name");
                                        String gender = rs.getString("gender");
                                        Integer age = rs.getInt("age");
                                        Float score = rs.getFloat("score");
                                        studentsList.add(new Students(id, name, gender, age, score));
                                        studentsList.forEach(System.out::println);
                                    }
                                    else
                                        System.out.println("None User is already registered");
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }
                            case 4 :     System.out.println("-----------------Exist------------------");
                        }
                    }while (!isSelectValid);
                case 5 : System.out.println("-----------------Exist------------------");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }
        }while (option!=5);
    }
}