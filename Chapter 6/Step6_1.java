/**
 * Created by ∆ук on 21.03.2016.
 */
public class Step6_1 {
	class Pair <One, Two>{
		private final One first;
		private final Two second;

		private Pair(One first, Two second){
			this.first = first;
			this.second = second;
		}

		One getFirst(){return this.first;}
		Two getSecond(){return this.second;}
		boolean equals(Pair pair2){
			//все nonnull
			if (this.getFirst()!= null && pair2.getFirst()!=null && this.getSecond() != null && pair2.getSecond()!= null){if (this.getFirst().equals(pair2.getFirst()) && this.getSecond().equals(pair2.getSecond())) return true;}
			//все null
			else if (this.getFirst()== null && pair2.getFirst()==null && this.getSecond() == null && pair2.getSecond()== null) return true;
				//оба first = null, оба second nonnull
			else if (this.getFirst()== null && pair2.getFirst()==null && this.getSecond() != null && pair2.getSecond()!= null) if(this.getSecond().equals(pair2.getSecond())) return true;
				//оба second = null, оба first nonnull
			else if (this.getFirst()!= null && pair2.getFirst()!=null && this.getSecond() == null && pair2.getSecond()== null) if(this.getFirst().equals(pair2.getFirst())) return true;
			return false;
		}
		public int hashCode(){
			int a; int b;
			if (this.getFirst() == null) a = 0;
			else  a = this.getFirst().hashCode();
			if (this.getSecond() == null) b = 0;
			else b = this.getSecond().hashCode();
			return (a + b);
		}
		public static <One,Two> Pair<One,Two> of(One first, Two second){
			Pair pair = new Pair(first,second);
			return pair;
		}
	}
}
