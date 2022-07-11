package 토비의_스프링.스프링의_이해와_원리.User.database;

public class User {
    // 사용자 정보를 저장할 때에느 자바빈 규약을 따르는 오브젝트를 이용하면 편리하다.
    // 먼저 사용자 정보를 저장할 때에는 User 클래스를 만들다.
    // 리스트 1-1은 id,name,password 세 개의 포로퍼처를 가진
    // User 클래스이다.


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
