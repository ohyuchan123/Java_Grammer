### 1.1.1 User

```
    DAO
    - DAO(Data Access Object)는 DB를 상요해 데이터를 조회하거나 조작하는 기능을
      전달하도록 만든 오브젝트를 말한다.
    

    사용자 정보를 저장할 때에느 자바빈 규약을 따르는 오브젝트를 이용하면 편리하다.
    먼저 사용자 정보를 저장할 때에는 User 클래스를 만들다. 리스트 1-1은
    id,name,password 세 개의 포로퍼처를 가진 User 클래스이다.
```

```java
package 토비의_스프링.스프링의_이해와_원리;

public class User {
    String id;
    String name;
    String password;
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
}

```

```
    이제 User 오브젝트에 담긴 정보가 실제로 보관될 DB의 테이블을 하나 만들어 보자.
    테이블의 이름은 USER로 프로퍼터는 User 클래스의 프로퍼티와 동일하게 구성된다,
```