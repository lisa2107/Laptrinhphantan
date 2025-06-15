package code;

public class Peterson implements Lock {
	boolean wantCS[] = { false, false };
	int turn = 1;

	@Override
	public void requestCS(int i) {
		// TODO Auto-generated method stub

		int j = 1 - i;
		wantCS[i] = true;
		turn = j;
		while (wantCS[j] && turn == j)
			;

	}

	@Override
	public void releaseCS(int i) {
		// TODO Auto-generated method stub

		wantCS[i] = false;

	}

}
