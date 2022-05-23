#include <cstdio>
#include <cstdlib>

#define MAX_NATIONS 2
#define MAX_PROVINCES 10
#define MAX_SCHOOLS 10
#define MAX_DEPTS 10
#define MAX_STUDENTS 4
#define MAX_COLUMNS 4

int *scoreGet(int *scoreList, int studentID)
{
    int *returnVal = (int *)malloc(sizeof(int) * 2);
    printf("%d", returnVal);
    int scoreAddr = (studentID - 1) * 4;

    int sum = 0;
    sum += *(scoreList + scoreAddr + 1); // 첫 번째 성적
    sum += *(scoreList + scoreAddr + 2); // 두 번째 성적
    sum += *(scoreList + scoreAddr + 3); // 세 번째 성적

    if (returnVal == NULL)
        return NULL; // malloc 실패

    returnVal[0] = sum;
    returnVal[1] = (sum / 3); // avg
    return returnVal;
}

int sumGet(int *scoreList, int studentID)
{
    int scoreAddr = (studentID - 1) * 4;
    int sum = 0;
    sum += *(scoreList + scoreAddr + 1); // 첫 번째 성적
    sum += *(scoreList + scoreAddr + 2); // 두 번째 성적
    sum += *(scoreList + scoreAddr + 3); // 세 번째 성적
    return sum;
}
float avgGet(int *scoreList, int studentID)
{
    int scoreAddr = (studentID - 1) * 4;
    int sum = 0;
    sum += *(scoreList + scoreAddr + 1); // 첫 번째 성적
    sum += *(scoreList + scoreAddr + 2); // 두 번째 성적
    sum += *(scoreList + scoreAddr + 3); // 세 번째 성적
    return sum / 3.0;
}

enum idType
{
    dept,
    school,
    province,
    nation
};
int *scoreGet(int *scoreList, int nationID)
{
    int *returnVal = (int *)malloc(sizeof(int) * 2);

    return returnVal;
}
int *scoreGet(int *scoreList, int nationID, int provinceID)
{
}
int *scoreGet(int *scoreList, int nationID, int provinceID, int schoolID)
{
}
int *scoreGet(int *scoreList, int nationID, int provinceID, int schoolID, int deptID)
{
}

bool isF(int *scoreList, int studentID)
{
    int scoreAddr = (studentID - 1) * 4;
    if (60 > *(scoreList + scoreAddr + 1))
        return true; // 첫 번째 성적
    if (60 > *(scoreList + scoreAddr + 2))
        return true; // 두 번째 성적
    if (60 > *(scoreList + scoreAddr + 3))
        return true; // 세 번째 성적
    return false;
}
int fCountGet(bool dummy, int scoreList[MAX_NATIONS][MAX_PROVINCES][MAX_SCHOOLS][MAX_DEPTS][MAX_STUDENTS][MAX_COLUMNS], int id, int idType)
{
    int count = 0;
    switch (idType)
    {
    case dept:
        for (int i = 0; i < MAX_STUDENTS; i++)
        {
        }
        break;
    case school:
        for (int i = 0; i < MAX_DEPTS; i++)
        {
            for (int j = 0; j < MAX_STUDENTS; j++)
            {
            }
        }
        break;
    case province:
        for (int i = 0; i < MAX_SCHOOLS; i++)
        {
            for (int j = 0; j < MAX_DEPTS; j++)
            {
                for (int k = 0; k < MAX_STUDENTS; k++)
                {
                }
            }
        }
        break;
    case nation:
        for (int i = 0; i < MAX_PROVINCES; i++)
        {
            for (int j = 0; j < MAX_SCHOOLS; j++)
            {
                for (int k = 0; k < MAX_DEPTS; k++)
                {
                    for (int l = 0; l < MAX_STUDENTS; l++)
                    {
                    }
                }
            }
        }
        break;
    default:
        return -1;
    }
    return count;
}
int fCountGet(int scoreList[MAX_NATIONS][MAX_PROVINCES][MAX_SCHOOLS][MAX_DEPTS][MAX_STUDENTS][MAX_COLUMNS])
{
    int count = 0;
    for (int t = 0; t < MAX_NATIONS; t++)
    {
        for (int i = 0; i < MAX_PROVINCES; i++)
        {
            for (int j = 0; j < MAX_SCHOOLS; j++)
            {
                for (int k = 0; k < MAX_DEPTS; k++)
                {
                    for (int l = 0; l < MAX_STUDENTS; l++)
                    {
                        for (int m = 1; m < MAX_COLUMNS; m++)
                        {
                            if (scoreList[t][i][j][k][l][m] < 60)
                            {
                                count++;
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
    return count;
}
int fCountGet(int scoreList[MAX_NATIONS][MAX_PROVINCES][MAX_SCHOOLS][MAX_DEPTS][MAX_STUDENTS][MAX_COLUMNS], int nationID)
{
    int count = 0;
    for (int i = 0; i < MAX_PROVINCES; i++)
    {
        for (int j = 0; j < MAX_SCHOOLS; j++)
        {
            for (int k = 0; k < MAX_DEPTS; k++)
            {
                for (int l = 0; l < MAX_STUDENTS; l++)
                {
                    for (int m = 1; m < MAX_COLUMNS; m++)
                    {
                        if (scoreList[nationID][i][j][k][l][m] < 60)
                        {
                            count++;
                            break;
                        }
                    }
                }
            }
        }
    }
    return count;
}
int fCountGet(int scoreList[MAX_NATIONS][MAX_PROVINCES][MAX_SCHOOLS][MAX_DEPTS][MAX_STUDENTS][MAX_COLUMNS], int nationID, int provinceID)
{
    int count = 0;
    for (int j = 0; j < MAX_SCHOOLS; j++)
    {
        for (int k = 0; k < MAX_DEPTS; k++)
        {
            for (int l = 0; l < MAX_STUDENTS; l++)
            {
                if (isF((int *)scoreList, l))
                    count++;
            }
        }
    }
    return count;
}
int fCountGet(int scoreList[MAX_NATIONS][MAX_PROVINCES][MAX_SCHOOLS][MAX_DEPTS][MAX_STUDENTS][MAX_COLUMNS], int nationID, int provinceID, int schoolID)
{
    int count = 0;
    for (int i = 0; i < MAX_DEPTS; i++)
    {
        for (int j = 0; j < MAX_STUDENTS; j++)
        {
            for (int k = 0; k < MAX_COLUMNS; k++)
            {
                if (scoreList[nationID][provinceID][schoolID][i][j][k] < 60)
                {
                    count++;
                    break;
                }
            }
        }
    }
}
int fCountGet(int scoreList[MAX_NATIONS][MAX_PROVINCES][MAX_SCHOOLS][MAX_DEPTS][MAX_STUDENTS][MAX_COLUMNS], int nationID, int provinceID, int schoolID, int deptID)
{
}

int main(void)
{
    static int score[2][5][10][10][4][4];

    for (int i = 0; i < 2; i++) // nation
    {
        for (int j = 0; j < 5; j++) // province
        {
            for (int m = 0; m < 10; m++) // school
            {
                for (int n = 0; n < 10; n++) // dept
                {
                    score[i][j][m][n][0][0] = (2000 * i) + (400 * j) + (40 * m) + (4 * n) + 1;
                    score[i][j][m][n][0][1] = 100;
                    score[i][j][m][n][0][2] = 80;
                    score[i][j][m][n][0][3] = 30;

                    score[i][j][m][n][1][0] = (2000 * i) + (400 * j) + (40 * m) + (4 * n) + 2;
                    score[i][j][m][n][1][1] = 30;
                    score[i][j][m][n][1][2] = 100;
                    score[i][j][m][n][1][3] = 80;

                    score[i][j][m][n][2][0] = (2000 * i) + (400 * j) + (40 * m) + (4 * n) + 3;
                    score[i][j][m][n][2][1] = 100;
                    score[i][j][m][n][2][2] = 100;
                    score[i][j][m][n][2][3] = 100;

                    score[i][j][m][n][3][0] = (2000 * i) + (400 * j) + (40 * m) + (4 * n) + 4;
                    score[i][j][m][n][3][1] = 0;
                    score[i][j][m][n][3][2] = 0;
                    score[i][j][m][n][3][3] = 0;
                }
            }
        }
    }
    printf("%d\t%d", scoreGet((int *)score, 102)[0], scoreGet((int *)score, 105)[1]);

    return 1;
}
