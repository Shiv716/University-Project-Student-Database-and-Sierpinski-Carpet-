package Lists;

public class Module {

    public final String  module_id ;
    public final int  avg_grade_module ;


    @Override
    public String toString() {
        return  "Module_id='" + module_id + '\'' +
                ", avg_grade='" + avg_grade_module + '\'';
    }

    public Module(String module_id, int avg_grade_module){
        this.module_id = module_id;
        this.avg_grade_module = avg_grade_module;
    }

}
