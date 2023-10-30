import java.util.Scanner;
//第一节java课小作业，顺序结构写一项调查并给出分数
public class Gender {
    public static void main(String[] args) {
        //输入
        Scanner input = new Scanner(System.in);
        //输入名字
        System.out.println("请输入您的名字:");
        String name = input.nextLine();
        int sum = 0;

        //设置题目
        //问题1
        System.out.println("1.第一题\n" + "A.完成一件事后才接手新事\n" + "B.用逻辑与事实服人\n" + "C.在任何冲突中不受干扰，保持冷静\n" + "D.充满乐趣与幽默感");
        String one = input.next();
        //判断选项，然后统计分数
        switch (one) {
            case "A":
                sum += 1;
                break;
            case "B":
                sum += 5;
                break;
            case "C":
                sum += 8;
                break;
            default:
                sum += 10;
                break;
        }


        System.out.println("\n 2.第二题\n" + "A.易接受他人的观点，不坚持已见\n" + "B.认为与人相处好玩，无所谓挑战或商机\n" + "C.待人得体有耐心\n" + "D.为他人利益愿意放弃个人意见");
        String two = input.next();
        switch (two) {
            case "A":
                sum += 1;
                break;
            case "B":
                sum += 5;
                break;
            case "C":
                sum += 8;
                break;
            default:
                sum += 10;
                break;
        }

        System.out.println("\n 3.第三题\n" + "A.情绪平稳，反应永远能让人预料到\n" + "B.自我肯定个人能力与成功\n" + "C.对学术、艺术特别爱好\n" + "D.始终精神愉快，并把快乐推广到周围");
        String three = input.next();
        switch (three) {
            case "A":
                sum += 1;
                break;
            case "B":
                sum += 5;
                break;
            case "C":
                sum += 8;
                break;
            default:
                sum += 10;
                break;
        }

        System.out.println("\n 4.第四题\n" + "A.以自已完美标准来设想衡量事情\n" + "B.自给自足，自我支持，无需他人帮忙\n" + "C.从不说或做引起他人不满与反对的事\n" + "D.游戏般地鼓励别人参与");
        String four = input.next();
        switch (four) {
            case "A":
                sum += 1;
                break;
            case "B":
                sum += 5;
                break;
            case "C":
                sum += 8;
                break;
            default:
                sum += 10;
                break;
        }

        System.out.println("\n 5.第五题\n" + "A.善解人意，能记住特别的日子，不吝于帮助别人\n"+ "B.不达目的誓不罢休\n"+ "C.不断愉快地说话、谈笑、娱乐周围的人\n"+"D.易接受别人的想法与方法，不愿与人相左");
        String five = input.next();
        switch (five) {
            case "A":
                sum += 1;
                break;
            case "B":
                sum += 5;
                break;
            case "C":
                sum += 8;
                break;
            default:
                sum += 10;
                break;
        }

        System.out.println("\n 6.第六题\n"+"A.愿意听到别人的想说的\n"+"B.对理想、工作、朋友都有不可言喻的忠实\n"+"C.天生的带领者，不相信别人的能力如自已\n"+"D.充满生机，精力充沛");
        String six =input.next();
        switch (six) {
            case "A":
                sum += 1;
                break;
            case "B":
                sum += 5;
                break;
            case "C":
                sum += 8;
                break;
            default:
                sum += 10;
                break;
        }

        System.out.println("\n 7.第七题\n"+"A.满足自已拥有的，甚少羡慕人\n"+"B.要求领导地位及别人跟随\n"+"C.用图表、数字来组织生活，解决问题\n"+"D.讨人喜欢，令人羡慕，人们注意的中心");
        String seven =input.next();
        switch (seven) {
            case "A":
                sum += 1;
                break;
            case "B":
                sum += 5;
                break;
            case "C":
                sum += 8;
                break;
            default:
                sum += 10;
                break;
        }

        System.out.println("\n 8.第八题\n"+"A.愿意听到别人的想说的\n"+"B.对理想、工作、朋友都有不可言喻的忠实\n"+"C.天生的带领者，不相信别人的能力如自已\n"+"D.有自己的判断力，从大局观考虑问题");
        String eight =input.next();
        switch (eight) {
            case "A":
                sum += 1;
                break;
            case "B":
                sum += 5;
                break;
            case "C":
                sum += 8;
                break;
            default:
                sum += 10;
                break;
        }

        System.out.println("\n 9.第九题\n"+"A.对已对人高标准，一切事情有秩序\n"+"B.易相处，易说话，易让人接近\n"+"C.不停地工作，不愿休息\n"+"D.聚会时灵魂人物，受欢迎的宾客");
        String nine =input.next();
        switch (nine) {
            case "A":
                sum += 1;
                break;
            case "B":
                sum += 5;
                break;
            case "C":
                sum += 8;
                break;
            default:
                sum += 10;
                break;
        }

        System.out.println("\n 10.第十题\n"+"A.易与人争吵，永远觉得自己是正确的\n"+"B.大无畏，不怕冒险\n"+"C.时时保持自已的举止合乎认同的道德规范\n"+"D.有小孩般的情绪，易激动，事后马上又忘了");
        String ten =input.next();
        switch (ten) {
            case "A":
                sum += 1;
                break;
            case "B":
                sum += 5;
                break;
            case "C":
                sum += 8;
                break;
            default:
                sum += 10;
                break;
        }

        System.out.println(name + "的分数是" + sum);
    }
}
