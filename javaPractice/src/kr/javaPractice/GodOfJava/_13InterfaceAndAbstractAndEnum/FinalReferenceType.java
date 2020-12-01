package kr.javaPractice.GodOfJava._13InterfaceAndAbstractAndEnum;

public class FinalReferenceType {
    final MemberDTO dto = new MemberDTO();

    public static void main(String[] args) {
        FinalReferenceType referenceType =new FinalReferenceType();
        referenceType.checkDTO();
    }

    public void checkDTO(){
        System.out.println(dto);
//        dto =new MemberDTO();
        dto.name="SungJun";
        System.out.println(dto);
    }

}
