# unix-api
# Checkout and Build
git checkout https://github.com/caodangtinh/unix-api.git
# How To Run
  - Run with default system file
    - java -jar target/unix-api-0.0.1-SNAPSHOT.jar
  - Run with configurable input file
    - java -jar target/unix-api-0.0.1-SNAPSHOT.jar --passwd-file=/etc/passwd --group-file=/etc/group
# APIs
  # User's APIs
  - List all user : http://localhost:8080/api/v1/users
  - Get user by Id : http://localhost:8080/api/v1/users/{id}
  - Get User group by Id: http://localhost:8080/api/v1/users/{id}/groups
  - Query User : http://localhost:8080/api/v1/users/query?name=name&uid=uid&gid=gid&comment=comment&home=home&shell=shell
  # Group's APIs
   - List all user : http://localhost:8080/api/v1/groups
   - Get group by Id : http://localhost:8080/api/v1/groups/{id}
   - Query Group : http://localhost:8080/api/v1/groups/query?name=name&gid=gid&member=member
