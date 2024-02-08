
public class _19_ejemplo {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4,88};
        int[] arr2 = {11, 21, 31, 41,5,3,6};

        int[] arr3 = new int[arr1.length + arr2.length];
        /*
        int indice = 0;

        for (int i = 0; i < arr1.length; i ++) {
            arr3[indice] = arr1[i];
            indice++;

            if (indice < arr3.length) {
                arr3[indice] = arr2[i];
                indice++;
            }
        }

        for (int i : arr3) {
            System.out.println(i);
        }
        */
        
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            arr3[k] = arr1[i];
            k++;
            i++;
            arr3[k] = arr2[j];
            k++;
            j++;
        }
        
        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }
        
        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
        }
        
        for (int x : arr3) {
			System.out.println(x);
		}
 
	}

}
