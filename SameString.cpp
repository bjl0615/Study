//#include <cstdio>
//#include <cstdlib>
//
//bool issamestring(char str1[], char str2[]); // 媛숈�� string�씠硫� true
//
//int main(void)
//{
//	char str1[6] = "apple";
//	char str2[7] = "aapple";
//	char str3[5] = "appl";
//	char str4[6] = "apple";
//
//	printf("%d\n", issamestring(str1, str2)); // false
//	printf("%d\n", issamestring(str1, str3)); // false
//	printf("%d\n", issamestring(str1, str4)); // true
//	printf("%d\n", issamestring(str2, str3)); // false
//	printf("%d\n", issamestring(str2, str4)); // false
//
//	return 1;
//}
//
//bool issamestring(char str1[], char str2[])
//{
//	int str1len = 0;
//	int str2len = 0;
//	for (int i = 0; str1[i] != '\0'; i++) {
//		str1len = i;
//	};
//	for (int i = 0; str2[i] != '\0'; i++) {
//		str2len = i;
//	};
//
//	if (str1len != str2len)
//		return false;
//
//	for (int i = 0; i < str1len; i++)
//		if (str1[i] != str2[i])
//			return false;
//
//	return true;
//}