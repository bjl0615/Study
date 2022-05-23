//#include <cstdio>
//#include <cstdlib>
//
//int* intSortArr(int arr[], int finished, int eddOfArray);
//
//int main(void) 
//{
//	int array[10] = { 30, 27, 54, 1465, 123, 123, 76, 631, 0, 1 };
//
//	int* arr;
//	arr = intSortArr(array, 0, 10);
//
//	for (int i = 0; i < 10; i++) {
//		printf("%d ", arr[i]);
//	}
//}
//
//int* intSortArr(int arr[], int finished, int endOfArray)
//{
//	if (finished == endOfArray - 1) {
//		return arr;
//	}
//
//	int min = finished;
//	for (int i = finished; i < endOfArray; i++) {
//		if (arr[min] > arr[i]) min = i;
//	}
//	
//	int tmp = arr[min];
//	arr[min] = arr[finished];
//	arr[finished] = tmp;
//	
//
//	return intSortArr(arr, finished + 1, endOfArray);
//}