class Solution {
public:
    int countStudents(vector<int>& students, vector<int>& sandwiches) {
     int cr=0,sq=0;
     stack<int> s;
    for(int i=sandwiches.size()-1;i>=0;i--){
        s.push(sandwiches[i]);
    }
    queue<int> q;
    for(int &student :students){
        if(student==0) cr++ ;else sq++;
        q.push(student);
    }
    while(not q.empty()){
        if(q.front()==s.top()){
            if(q.front()==0) cr--;else sq--;
            q.pop();
            s.pop();
        }else if(cr==0 or sq==0) break;
        else{
            q.push(q.front());
            q.pop();
        }
    }
    return q.size();
    }
};