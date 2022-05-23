//#include <cstdio>
//#include <cstdlib>
//
//int* incSortArr(int arr[], int finished, int endOfArray);
//
//int main(void)
//{
//	int array[10] = { 30, 27, 54, 1465, 123, 123, 76, 631, 0, 1 };
//
//	int* sortedArray;
//	sortedArray = incSortArr(array, 0, 10);
//
//	for (int i = 0; i < 10; i++)
//		printf("%d ", sortedArray[i]);
//
//	return 1;
//}
//
//int* incSortArr(int arr[], int finished, int endOfArray)
//{
//	if (finished == (endOfArray - 1)) {
//		return arr;
//	}
//
//	int max = finished;
//	for (int i = finished; i < endOfArray; i++) {
//		if (arr[max] < arr[i]) {
//			max = i;
//		}
//	}
//
//	int tmp = arr[finished];
//	arr[finished] = arr[max];
//	arr[max] = tmp;
//
//
//	return incSortArr(arr, finished + 1, endOfArray);
//}