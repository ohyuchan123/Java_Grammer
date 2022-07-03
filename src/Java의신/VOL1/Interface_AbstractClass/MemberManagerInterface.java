package Java의신.VOL1.Interface_AbstractClass;

import Java의신.VOL1.ReferenceMaterialType.MemberDTO;

public interface MemberManagerInterface {
    public boolean addMember(MemberDTO member);
    public  boolean removeMember(String name,String phone);
    public boolean updateMember(MemberDTO member);
}
