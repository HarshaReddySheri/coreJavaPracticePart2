package comSnoA12.harsha.propertiesfileHandling;

public class NotesPropPractice {
	/*
	 * Agenda
	 *********
	 *
	 * what is properties file?
	 * 
	 * same like text file but some small difference
	 * 
	 * 1. Extension -> for textFile-> .txt
	 * 				-> for propertiesFile -> .properties
	 * 
	 * 2. text file stored text data
	 * 	  properties file stored key & value pair
	 * 
	 * for Ex:
	 * 		propertiesFile usage of interface Map & hashTable
	 * 		key & value pair combination
	 * 
	 *   	key = value 
	 *   separated by =
	 *   
	 * 3. forExample
	 *    I want to connect with a database
	 * 
	 * 1.which type of data i need first & where the database were installed.
	 * 
	 *   database url 
	 *   forExample localHost used as a URL for own machine
	 *   
	 *   forExample OtherMachine we have to use url & password for connection database
	 *   
	 *    
	 *    public class ConnectToDB{
	 *    p s v m (String [] args){
	 *    String url = "localhost";
	 *    String UserName = "hyrtutorials"
	 *    String password = "hyr123"
	 *    
	 *    //bussiness locic for connectingToDB
	 *    //operations
	 *    }
	 *    }
	 *    
	 *    If i want to url & username & password & logic & operation to connectToDB
	 *    
	 *    when i build a db & hosted
	 *    
	 *    the data changes are here
	 *   
	 *   Here the data is only changing url,password, username
	 *   we don't changing the bussiness & operation logic
	 *   
	 *    public class connectToDB{
	 *    p s v m (String [] args ){
	 *    String url = "https:192.168.10.20";
	 *    String username = "admin";
	 *    String password = "admin123";
	 *    
	 *    //business logic for connectingToDB
	 *    //operations
	 *    }
	 *    }
	 *   
	 *    
	 *    No need of application change code (Bussiness logic)
	 *    
	 *    When you need to updated an application?
	 *    Bussiness logic changes is done you have to cahange application details or code
	 *    
	 *    To change the application we need eclipse for java
	 *    
	 *    Here the concept is 
	 *    not required of code change in application
	 *    so we don't need ecllipse and so on........
	 *    
	 *    To change the userData or UserCredentials
	 *    
	 *    we need properties file To change userName, password, Url
	 *    
	 *      Rule of PropertiesFile
	 *      **********************
	 *      No need of place it in double quite's
	 *      
	 *      1. url = localHost
	 *      2. UserName = hyrtutorials
	 *      3. password = hyr123
	 *    
	 *    forExample
	 *    **********
	 *    Automachine testing
	 *    
	 *    let say i want to oen application in broweswr
	 *    --> firstly we have to login
	 *    --> After that you testing has started
	 *    testing Scripts
	 *    
	 *    What is Application URL=
	 *    		  Application password =
	 *    		  Application USerNAme =
	 *    
	 *    let say your are using crome Or FireFox drive
	 *    
	 *    where the drive executable file are exist?
	 *    
	 *    what is default timeOut?
	 *    
	 *    where to generated reportes?
	 *    
	 *    you have to provide these externally then we use properties file
	 *    
	 *    but the situation demands we
	 *    use properties file Or
	 *    use Amil file or
	 *    use Json file or
	 *    use Xml file.................
	 *     
	 * 		
	 * 
	 */
	
	
	/*
	 * Properties file -> as same as Map collection
	 * 
	 * Properties class -> extends hashTable -> extends Map
	 * 
	 * This is the reason
	 * ******************
	 * what we did till now is  properties related.
	 * But we have other methods(from hashTable & map)
	 * prop.put(); -> same like .setProperty();
	 * prop.put(IfAbsent(key, value));
	 * prop.isempty();
	 * prop.clear();
	 * prop.contains(key);
	 * prop.contains(value);
	 * prop.size(int);
	 */
	/*
	 * EveryThing from map Collection
	 * 
	 * properties are also used to store in a structure format [key = value]
	 * and it extending the hashTable 
	 * it is also kind of collection
	 * 
	 * but properties is not a part of collection as per the java content
	 * 
	 * properties file are perform here with Stream & we can use Peader & Writer also
	 * 
	 * 
	 */
}
