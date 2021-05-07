package BestPackageEver;

float function(int a, float b, float c)
start
    first = 7 + 5;

    for (i = 0; i < 15; i+=2)
    start
        first += 3;
    finish

	return (a + (b + c));
finish

int isValid(float b)
start
	if(b > 10.0)
    then
        start
            return 1;
        finish

   return 0;
finish

float testIf(int index)
start
	if(index > 10)
    then
        start
            print(111);
        finish
    else
        start
            print(112);
            return -1;
        finish

	d = function(index, 100.0, 20.0);

	return d;
finish


main
    start
        a = 5.4;
        for (i = 0; i < 10; i+=1)
        start
            res = testIf(i);
            print(res);

            isResValid = isValid(6.0);
            print(isResValid);

        finish
    finish