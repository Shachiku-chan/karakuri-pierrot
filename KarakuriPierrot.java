public class KarakuriPierrot {
	
	public static void main(String[] args) {
		String me = "僕";
		String you = "君";
		
		System.out.println("待ち合わせは2時間前で");
		System.out.println("此処に独り それが答えでしょ");
		System.out.println("街ゆく人 流れる雲");
		System.out.println(me + "のことを嘲笑ってた\n");
		
		for(int i=0; i<2; i++)
			System.out.print((i == 0 ? "それは簡単" : "とても困難") + "で ");
		System.out.println("\n認めることで前に進めるのに");
		for(int i=0; i<2; i++)
			System.out.print("信じ" + (i == 0 ? "られ" : "たく") + "なくて ");
		System.out.println("\n" + you + "の中できっと" + me + "は道化師なんでしょ\n");
		
		lyric1("Ah", "回って", "回り疲れて", "息が", "切れたの");
		System.out.println("そう これが悲しい" + me + "の末路だ");
		System.out.println(you + "に辿り着けないままで\n");
		
		for(int i=0; i<2; i++)
			System.out.println((i == 0 ? me + "を乗せて地球は" : "何も知らない顔して") + "回る");
		System.out.println("1秒だけ呼吸を止めて");
		System.out.println("何も言えず立ちすくむ" + me + "\n");
		
		for(int i=0; i<2; i++)
			System.out.print((i == 0 ? "それは偶然" : "そして運命") + "で ");
		System.out.println("\n知らないほうが良いと知ってたのに");
		System.out.println("触れてしまったの　" + you + "の温もりに");
		for(int i=0; i<2; i++)
			System.out.print("その" + (i == 0 ? "笑顔" : "仕草") + "で ");
		System.out.println("\n" + me + "が壊れてしまうから\n");
		
		lyric1("ah...", "回って", "回り疲れて", "息が", "息が止まるの\n");
		
		lyric1("Ah", "変わって", "変わってゆくのが", "怖い", "だけなの");
		System.out.println("もうやめた　ここで" + you + "を待つのは");
		System.out.println(me + "が壊れてしまうだけだ\n");
		
		lyric1("ah...", "回って", "回り疲れて", "息が", "止まるの");
		System.out.println("そう　" + me + "は" + you + "が望むピエロだ");
		System.out.println(you + "が思うままに　操ってよ");
	}
	
	
	public static void lyric1(String w0, String w1, String w2, String w3, String w4) {
		for(int i=0; i<2; i++) {
			System.out.print(w0+" ");
			if (i == 0) {
				for(int j=0; j<2; j++)
					System.out.print(w1+" ");
				System.out.println(w2);
			} else {
				for(int j=0; j<2; j++)
					System.out.print(w3+" ");
				System.out.println(w4);
			}
		}
	}

}
