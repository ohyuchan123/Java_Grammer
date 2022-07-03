package Java의신.VOL1.Interface_AbstractClass;

import Java의신.VOL1.ReferenceMaterialType.MemberDTO;

public class MemberManager implements MemberManagerInterface{

    @Override
    public boolean addMember(MemberDTO member) {
        return false;
    }

    @Override
    public boolean removeMember(String name, String phone) {
        return false;
    }

    @Override
    public boolean updateMember(MemberDTO member) {
        return false;
    }
}
