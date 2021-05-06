package BestPackageEver;

float function(int a, float b, float c)
start
    first = 7 + 5;
    first += 3;

	return (a + (b + c));
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
            r = 10;
            print(r);

            testIf(i);

            print(i);

        finish
    finish