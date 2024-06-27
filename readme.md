//Every method has its own space inside the stack and every instance variables has their own space inside the heap memory 

// We can't use non-static variables inside the static methods but we can use it by using the object references.

// The default value of the string is null because it's an object 

// Every method inside the interface is public abstract by default
// All the variables inside the interface is by default static and final

// switch also supports enums!!!

// Annotations are used to tell the compiler about your intention (eg:- @override keyword)

// Lamda expressions only works with the Functional Interface because it contains only one method and lamda expression knows which method to implement.

// Generics help us to remove the runtime error.

//TreeSet gives you the sorted value
// Don't implement the parallel stream with sort method

## JDBC connection steps:-
1. import the package
2. (a) load
   (b) register
3. Establish the connection
4. Create the statement
5. Execute the query
6. Process reset
7. close the connections and resources 

## Java resources

## How to Install and Configure JDBC with MySQL also Create Database in VS Code 
`https://medium.com/@rahulkumarverma9198/how-to-install-and-configure-jdbc-with-mysql-also-create-database-in-vs-code-0e41ae93ca75`

## Complete Java, Spring, and Microservices course
`https://www.youtube.com/watch?v=4XTsAAHW_Tc&t=42342s`

## commonly used methods are:

## boolean execute(String sql):
 executes a general SQL statement. It returns true if the query returns a ResultSet, false if the query returns an update count or returns nothing. This method can be used with a Statement only.

## int executeUpdate(String sql):
executes an INSERT, UPDATE or DELETE statement and returns an update account indicating number of rows affected (e.g. 1 row inserted, or 2 rows updated, or 0 rows affected).

## ResultSet executeQuery(String sql):
executes a SELECT statement and returns a ResultSet object which contains results returned by the query.