package kr.javaPractice.GodOfJava._13InterfaceAndAbstractAndEnum;


public interface MemberManager {
    public boolean addMember(MemberDTO member);
    public boolean removeMember(String name, String phone);
    public boolean updateMember(MemberDTO member);
}
