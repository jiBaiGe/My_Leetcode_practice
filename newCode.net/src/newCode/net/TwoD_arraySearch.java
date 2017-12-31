package newCode.net;

public class TwoD_arraySearch {
	
	public boolean Find(int target, int [][] array) {
        for(int x = 0;x < array.length; x++){
            for(int y = 0;y < array[x].length; y++){
                if(array[x][y] == target){return true;}
            }
        }
        return false;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
