
public class TV implements SmartRemote{

	@Override
	public void channel(int Enterbutton) {
		// TODO Auto-generated method stub
		
		System.out.println("cannel changed, button number = "+Enterbutton);
		
	}

	@Override
	public void ott(int EnterOtt) {
		// TODO Auto-generated method stub
		
		System.out.println("OTT changed, ottnumber - "+EnterOtt);
		
	}

}
