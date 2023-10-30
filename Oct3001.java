import java.util.Scanner;

public class Oct3001 {
    public static void main(String[] args) {
//        定义全局变量，玩家名字player_name，电脑名字com_name，玩家出拳player_choice，电脑出拳com_choice,玩家出拳结果p_choice,电脑出拳结果c_choice
        String player_name;
        String com_name;
        int player_choice;
        int com_choice;
        String p_choice;
        String c_choice;
        //进入界面
        System.out.println("**************************");
        System.out.println("Game name：Rock、scissor、papers");
        System.out.println("           Writer:wenguan gao");
        System.out.println("           Edition:v1.1");
        System.out.println("**************************");
        System.out.println("Welcome to Rock、scissor、papers\n");
        System.out.println("**************************");
//        输入设备
        Scanner input = new Scanner(System.in);
        System.out.println("Please name your role:");
        player_name = input.next();
//        解决名字里只出现空格的bug
        if(player_name.trim() == ""){
            player_name = "anonymous_player";
        }
        System.out.println("**************************");
        System.out.println("Please choose a computer:");
        System.out.println("1.Tom");
        System.out.println("2.Jerry");
        System.out.println("**************************");
//        用户选择电脑玩家
        System.out.println("Please input \"1\" or \"2\":");
        String com_ch = input.next();
//        解决用户非法选择电脑玩家的bug
        switch (com_ch){
            case "1":com_name = "Tom";break;
            case "2":com_name = "Jerry";break;
            default:com_name = "anonymous_name";
        }

//        玩家出拳
        System.out.println("**************************");

        System.out.println("input 1----scissor");
        System.out.println("input 2----rock");
        System.out.println("input 3----paper");
        System.out.println("*************************");
        System.out.println("Please player do a choice:\n");
//        玩家出拳和电脑出拳
        System.out.println("Your choice:");
//        解决玩家非法选择出拳bug,用中间变量player_tem_choice解决输入数值问题
        String player_tem_choice = input.next();
        switch (player_tem_choice){
            case "1" : player_choice = Integer.parseInt(player_tem_choice);
            case "2" : player_choice = Integer.parseInt(player_tem_choice);
            case "3" : player_choice = Integer.parseInt(player_tem_choice);
            default : player_choice = (int) Math.round(Math.random()*2+1);
        }
        System.out.println("！！！If you make a false choice,the system will have a random choice for you！！！");
//        将玩家选择变为出拳结果
        switch (player_choice){
            case 1 : p_choice = "scissor" ; break ;
            case 2 : p_choice = "rock" ; break ;
            case 3 : p_choice = "paper" ; break ;
            default : p_choice = "Error!!!" ;
        }
        com_choice = (int) Math.round(Math.random()*2+1);
//        将电脑选择变为出拳结果
        switch (com_choice){
            case 1 : c_choice = "scissor" ; break ;
            case 2 : c_choice = "rock" ; break ;
            case 3 : c_choice = "paper" ; break ;
            default : c_choice = "Error!!!" ;
        }
        System.out.println("**************************\n");
        System.out.println("Results:");
//        出拳的数值相减为1或者为-2，胜
        if (player_choice-com_choice == 1 || player_choice - com_choice == -2){
            System.out.println(player_name + " choosed " + p_choice + ", "+ com_name + " choosed "+c_choice);
            System.out.println(player_name+" won!");
        }else if(com_choice-player_choice == 1 || com_choice - player_choice == -2){
            System.out.println(player_name + " choosed " + p_choice + ", "+ com_name + " choosed "+c_choice);
            System.out.println(com_name+" won!");
        }else{
            System.out.println(player_name + " choosed " + p_choice + ", "+ com_name + " choosed "+c_choice);
            System.out.println("Dogfall!");
        }
    }
}
