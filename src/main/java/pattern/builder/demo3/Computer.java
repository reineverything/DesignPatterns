package pattern.builder.demo3;

/**
 * @ClassName Computer
 * @Author shuai
 * @create 2023/7/18 9:51
 * @Instruction
 */
public class Computer {

    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    //提供私有的构造方法，防止外界直接创建对象
    private Computer(Builder builder){
        this.cpu=builder.cpu;
        this.screen=builder.screen;
        this.memory=builder.memory;
        this.mainboard=builder.mainboard;
    }

    //将构建者通过内部类的方式创建
    public static final class Builder{
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        //对每个组件都创建一个构建者
        public Builder cpu(String cpu){
            this.cpu=cpu;
            return this;
        }
        public Builder screen(String screen){
            this.screen=screen;
            return this;
        }
        public Builder memory(String memory){
            this.memory=memory;
            return this;
        }
        public Builder mainboard(String mainboard){
            this.mainboard=mainboard;
            return this;
        }


        //使用构建者创建Computer对象
        public Computer build(){
            return new Computer(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "cpu='" + cpu + '\'' +
                    ", screen='" + screen + '\'' +
                    ", memory='" + memory + '\'' +
                    ", mainboard='" + mainboard + '\'' +
                    '}';
        }
    }
}
