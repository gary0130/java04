import java.util.*;


public class Main
{
	//輸入
	static Scanner Scan =new Scanner(System.in);
	static String arwords[] =new String[30];
	static String words="";
	static int speed,co,debug;
	public static void main(String[] args) throws InterruptedException 
	{
		//這裡是主程式
		welcome();//歡迎詞
		System.out.println("字詞已經加入！");
		//不要換行，以"，"隔開
		words = "蒹葭蒼蒼，白露為霜，所謂伊人，在水一方，溯洄從之，道阻且長，溯游從之，宛在水中央，蒹葭萋萋，白露未晞，所謂伊人，在水之湄，溯洄從之，道阻且躋，溯游從之，宛在水中坻，蒹葭采采，白露未已，所謂伊人，在水之涘，溯洄從之，道阻且右，溯游從之，宛在水中沚";
		System.out.println("標題：蒹葭");
		prepare();//將字詞存入陣列
		
		spd();
		if (debug != 1)
		{
			do{
				if(co==1){
					spd();
					}
				start();//開始
				end();
				retry();
			}while(co == 1);
		}


	}


	public static void welcome() throws InterruptedException
	{
		//歡迎詞
		System.out.println("v0.3.9");
		System.out.println("歡迎使用!");
		Thread.sleep(500);
		System.out.println("本程式由gary30製作");
		System.out.println("它可以定時印出文字");
		System.out.println();


	}
	public static void ready() throws InterruptedException
	{
		//預備詞
		System.out.println();
		System.out.println("速度是" + speed);
		Thread.sleep(1000);
		System.out.println("準備中…");
		System.out.println();
		System.out.println();

	}
	public static void prepare()
	{
		//存入陣列
		arwords = words.split("，");
	}
	public static void start() throws InterruptedException
	{
		//輸出
		System.out.println();
		int i=0;
		for (i=0;i < arwords.length;i++)
		{
			System.out.println(arwords[i]);
			Thread.sleep(speed);
		}
	}
	public static void end()
	{
		//結束
		System.out.println();
		System.out.println();
		System.out.println("輸出完成");

	}
	public static void retry()
	{
		//重試詞
		System.out.println();
		System.out.println("再一次嗎？(輸入1)");
		co = Scan.nextInt();
	}
	public static void spd()
	{
		try
		{
			System.out.println("請輸入速度(單位為毫秒)");
			speed = 1000;
			speed = Scan.nextInt();//輸入速度
		}
		catch (Exception e)
		{
			System.out.println("錯誤！");
			debug = 1;
		}
		
	}




}