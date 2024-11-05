/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
import model.Patient;
public class DatabaseConnector {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/medicaldb?useSSL=false";
    private static final String USER = "root";
    private static final String DB_PASSWORD = "Cel365";
    
    
    // CRUD operations on databse 
    
    // C - Create : inserting data into the database 
    public static void addPatient(Patient p1) throws SQLException{ 
        System.out.println("RUNNING QUERY");
        String QUERY = "INSERT INTO patient(firstname, gender, patient_type) VALUES (?, ?, ?)";
        try{  
            Connection conn = DriverManager.getConnection(DB_URL, USER, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(QUERY);
            stmt.setString(1, p1.getFirstName());
            stmt.setString(2, p1.getGender());
            stmt.setString(3, p1.getPatientType());
            
            int rows = stmt.executeUpdate();
            
            System.out.println("Rows inserted : " + rows);
            
            conn.close() ;
        }catch (SQLException sqle) { 
            System.out.println(sqle);
        } catch (Exception ex) { 
            System.out.println(ex);
        }
        
    }
            
    // R - Read 
    public static ArrayList<Patient> getPatients()  { 
        ArrayList<Patient> patients = new ArrayList();
        String QUERY = "SELECT * FROM patient";
        try{  
            Connection conn = DriverManager.getConnection(DB_URL, USER, DB_PASSWORD);
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);
            while(rs.next()) { 
                Patient p1 = new Patient() ;
                p1.setId(Integer.parseInt(rs.getString("id")));
                p1.setFirstName(rs.getString("firstname"));
                p1.setLastName(rs.getString("lastname"));
                p1.setGender(rs.getString("gender"));
                p1.setPatientType(rs.getString("patient_type"));
                patients.add(p1);
            }
            rs.close();
            conn.close() ;
        }catch (SQLException sqle) { 
            System.out.println(sqle);
        } catch (Exception ex) { 
            System.out.println(ex);
        }
        return patients;
    }
    
    public static void getPatientName()  { 
        String QUERY = "SELECT firstname, lastname FROM patient";
        try{  
            Connection conn = DriverManager.getConnection(DB_URL, USER, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(QUERY);
            
            int rows = stmt.executeUpdate();
            
            System.out.println("Rows inserted : " + rows);
            
            conn.close() ;
        }catch (SQLException sqle) { 
            System.out.println(sqle);
        } catch (Exception ex) { 
            System.out.println(ex);
        }
    }
    
    // U - Update
    public static void updatePatient(Patient updatedPatient) { 
        String QUERY = "UPDATE patient SET firstname = ?, gender = ?, patient_type = ? WHERE id=?";
        try{  
            Connection conn = DriverManager.getConnection(DB_URL, USER, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(QUERY);
            
            System.out.println(updatedPatient.getFirstName()+ "?????");
            
            stmt.setString(1, updatedPatient.getFirstName());
            stmt.setString(2, updatedPatient.getGender());
            stmt.setString(3, updatedPatient.getPatientType());
            stmt.setInt(4, updatedPatient.getId());
            
            
            int rows = stmt.executeUpdate();
            
            System.out.println("Rows updated : " + rows);
            
            conn.close() ;
        }catch (SQLException sqle) { 
            System.out.println(sqle);
        } catch (Exception ex) { 
            System.out.println(ex);
        }
    }
    
    // D - Delete 
    public static void deletePatient(Patient p1) { 
        String QUERY = "DELETE FROM patient WHERE id = ?";
        try{  
            Connection conn = DriverManager.getConnection(DB_URL, USER, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(QUERY);
            
            stmt.setInt(1, p1.getId());
            int rows = stmt.executeUpdate();
            
            System.out.println("Rows deleted : " + rows);
            
            conn.close() ;
        }catch (SQLException sqle) { 
            System.out.println(sqle);
        } catch (Exception ex) { 
            System.out.println(ex);
        }
    }
}
