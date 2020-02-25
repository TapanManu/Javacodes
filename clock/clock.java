class Clock{
    int hrs;
    int min;
    int sec;
    Clock(){
        hrs=12;
        min=0;
        sec=0;
    }
    Clock(int hrs,int mins,int sec){
        this.hrs=hrs%12;
        this.min=mins%60;
        this.sec=sec%60;
    }
    Clock(int s){
        min=s/60;
        hrs=s/(3600);
        sec=s%60;
    }
    public void setClock(int s){
        min=s/60;
        hrs=s/(3600);
        sec=s%60;
    }
    public int getHours(){
        return hrs;
    }
    public int getMinutes(){
        return min;
    }
    public int getSeconds(){
        return sec;
    }
    public void tick(){
        if(sec==59){
            sec=0;
            if(min==59){
                min=0;
                hrs+=1;
            }
            else{
                min+=1;
            }
        }
        else{
            sec+=1;
        }
        System.out.println(this);
    }
    public void tickDown(){
        if(sec==0){
            sec=59;
            if(min==0){
                min=59;
                hrs-=1;
            }
            else{
                min-=1;
            }
        }
        else{
            sec-=1;
        }
        System.out.println(this);
    }
    public String toString(){
        String time;
        time = hrs+":"+min+":"+sec;
        if(min<10){
            time = hrs+":"+"0"+min+":"+sec;    
        }
        if(sec<10){
            time = hrs+":"+min+":"+"0"+sec;
        }
        if(sec<10 && min<10){
            time = hrs+":"+"0"+min+":"+"0"+sec;
        }
        return time;
    }
    public void addClock(Clock add){
        this.hrs=this.hrs+add.hrs;
        this.min=this.min+add.min;
        this.sec=this.sec+add.sec;
        if(this.sec>=60){
            this.min+=1;
        }
        if(this.min>=60){
            this.hrs+=1;
        }
        this.hrs%=12;
        this.min%=60;
        this.sec%=60;
        System.out.println(this);
    }
    public void subClock(Clock sub){
        this.hrs=this.hrs-sub.hrs;
        this.min=this.min-sub.min;
        this.sec=this.sec-sub.sec;
        if(this.sec<0){
            this.sec=60+this.sec;
            if(this.min==0){
                this.min=60;
                if(this.hrs==0)
                    this.hrs=12;
                this.hrs-=1;    
            }
            this.min-=1;
        }
        if(this.min<0){
            this.min=60+this.min;
            if(this.hrs==0)
                this.hrs=12;
            this.hrs-=1;
        }
        if(this.hrs<0){
            this.hrs=12+this.hrs;
        }
        
        System.out.println(this);
    }
}
class ClockDemo extends Clock{ 
    public static void main(String[] args) {
       Clock firstclock = new Clock(100);
       for(int i=0;i<10;i++){
           firstclock.tick();
       }
       Clock secondclock = new Clock(10,00,00);
       for(int i=0;i<10;i++){
           secondclock.tick();
       }
       firstclock.addClock(secondclock);
       Clock thirdclock = new Clock();
       thirdclock.subClock(firstclock);
    }

}
