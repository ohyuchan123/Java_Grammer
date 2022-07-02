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
    public void MakeMemberObject(){
        MemberDTO dto1 = new MemberDTO();
        MemberDTO dto2 = new MemberDTO("Sangmin");
        MemberDTO dto3 = new MemberDTO("Sangmin","010-XXXX-YYYY");
        MemberDTO dto4 = new MemberDTO("Sangmin","010-XXXX-YYYY","javagod@email.com");

        System.out.println("name : "+dto1.name+"   |   phone : "+dto1.phone+"   |   email : "+dto1.email);
        System.out.println("name : "+dto2.name+"   |   phone : "+dto2.phone+"   |   email : "+dto2.email);
        System.out.println("name : "+dto3.name+"   |   phone : "+dto3.phone+"   |   email : "+dto3.email);
        System.out.println("name : "+dto4.name+"   |   phone : "+dto4.phone+"   |   email : "+dto4.email);
    }

    public static void main(String[] args) {
        MemberDTO mem = new MemberDTO();

        mem.MakeMemberObject();
    }
}
