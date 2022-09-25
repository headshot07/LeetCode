package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class CommonElements
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        ArrayList<Integer> a=new ArrayList<Integer>();
        HashSet<Integer> hashSet = new HashSet<Integer>();
        HashSet<Integer> hashSet1 = new HashSet<Integer>();
        HashSet<Integer> hashSet2= new HashSet<Integer>();
        for (int i = 0; i <n1; i++)
            hashSet.add(A[i]);
        for (int i = 0; i <n2; i++)
            hashSet1.add(B[i]);
        for (int i = 0; i <n3; i++)
            hashSet2.add(C[i]);
        for (Integer i : hashSet){
            if(hashSet.contains(i) && hashSet1.contains(i) && hashSet2.contains(i))
                a.add(i);
        }
        Collections.sort(a);
        return a;
    }
}
