package Java의신.VOL1.ReferenceMaterialType;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;
    /*
    * 아무 정보도 모를 때
    * */
    public MemberDTO(){

    }

    /*
    * 이름만 알 떄
    * @Param name
    * */
    public MemberDTO(String name){
        this.name=name;
    }

    /*
    * 이름과 전화번호만 알때
    * @Param name
    * @Param phone
    * */
    public MemberDTO(String name,String phone){
        this.name = name;
        this.phone = phone;
    }

    /*
    * 모든 정보를 알고 있을 떄
    * @Param name
    * @Param phone
    * @Param email
    * */
    public MemberDTO(String name,String phone,String email){
        this.name =name;
        this.phone = name;
        this.email = email;
    }

    public MemberDTO getMemberDTO(){
        MemberDTO dto = new MemberDTO();
        return dto;
    }
}
