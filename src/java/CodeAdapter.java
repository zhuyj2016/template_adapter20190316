public class CodeAdapter extends Code_v1{

    private Code_v0 code_v0;

    public CodeAdapter(){};

    public CodeAdapter(Code_v0 code_v0){
        this.code_v0=code_v0;
    }

    public String findData_v0(){
        code_v0.findData();
        return "正式版本，去数据库查询数据，返回正式数据";

    }
}
