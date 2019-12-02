package mang_va_phuong_thuc_trong_java;

import java.util.Date;

public class StopWatch {
    private long starTime;
    private long endTime;
// trường dữ liệu
    public StopWatch(){
    this.starTime=System.currentTimeMillis();
    }

// khởi tạo phương thức với 2 tham số.

    public long getStarTime() {
        return this.starTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    // phương thức khởi tạo set get
    public long start(){
        return starTime=System.currentTimeMillis();
    }
    public long stop(){
        return endTime=System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.stop()-this.start();
    }
}
