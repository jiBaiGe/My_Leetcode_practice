package twoD_array;


//��ĿҪ���һ����������Ķ�ά�����в���ĳ��ֵ
public class TwoDArray {

	//��һ�ַ���������ķ��������α�����
	public static boolean Find(int target, int [][] array) {
		
        for(int x = 0;x < array.length; x++){
            for(int y = 0;y < array[x].length; y++){
                if(array[x][y] == target){return true;}
            }
        }
        return false;
      
    }
	
	//��Ϊ��������ɵĶ�ά���飬����ͨ���������ٶ�λ��
	public static boolean Find2(int target, int [][] array) {
		for(int i = 0; target > array[0][i];i++) {
		  if(target == array[0][i]) {return true;}
			for(int j = 0; target > array[i][j];j++) {
			  if(target == array[i][j]) {return true;}
			}
		}
		return false;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array = {{1,10,19},{3,12,21},{5,14,23},{7,16,25},{9,18,27}};
		boolean dohave = Find(9,array);
		System.out.println(dohave);
	}

}
