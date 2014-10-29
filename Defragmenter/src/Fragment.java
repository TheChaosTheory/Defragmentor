//Chris Mueller, Brian Zhu, Tommy Lazar

public class Fragment{

	protected int id;
	protected int offset;
	protected int fragmentLength;
	protected boolean moreFrag;

	public Fragment(int idx, int offsetx, int fragmentLengthx, boolean moreFragx){
		id = idx;
		offset = offsetx;
		fragmentLength = fragmentLengthx;
		moreFrag = moreFragx;

	}

	public int getid(){
		return id;
	}

	public int getOffset(){
		return offset;
	}

	public int getFragmentLength(){
		return fragmentLength;
	}

	public boolean getMoreFrag(){
		return moreFrag;
	}        
	//This Is Intentilly Left Blank

}