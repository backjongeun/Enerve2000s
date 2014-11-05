/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.enerve2000s.dcdata;

/**
 *
 * @author kwon
 */
public class DcInfo {
    private String swDate;
    private String swVersion;
    private String fwDate;
    private String fwVersion;

    public String getSwDate() {
        return swDate;
    }

    public void setSwDate(String swDate) {
        this.swDate = swDate;
    }

    public String getSwVersion() {
        return swVersion;
    }

    public void setSwVersion(String swVersion) {
        this.swVersion = swVersion;
    }

    public String getFwDate() {
        return fwDate;
    }

    public void setFwDate(String fwDate) {
        this.fwDate = fwDate;
    }

    public String getFwVersion() {
        return fwVersion;
    }

    public void setFwVersion(String fwVersion) {
        this.fwVersion = fwVersion;
    }

    public class DcStatus {
//          EstSec: Word;                        // 2
//          DCMeterDateTime: TDCDateTime;     // 7
//          DCServerDateTime: TDCDateTime;     // 7
//          AlarmLevel: Byte;
//          TimeDailyPeak: array[0..1] of Byte;      // 2
//          TimeMonthlyPeak: array[0..2] of Byte;    // 3
//          TimePeak: array[0..4] of Byte;           // 5
//          GoalWatt: Cardinal;                      // 2
//          ForecastWatt: Cardinal;                  // 2
//          BaseWatt: Cardinal;                      // 2
//          CurrentWatt: Cardinal;                   // 2
//          PrevPeakWatt: Cardinal;                  // 2
//          DailyPeakWatt: Cardinal;                 // 2
//          MonthlyPeakWatt: Cardinal;               // 2
//          PeakWatt: Cardinal;                      // 2
        

        private int estSec;
        private int dcDateTime; // 배열로 구현
        private int dlcDateTime; // 배열로 구현
        private byte alarmLevel;
        private byte timeDayPeak; // 배열로 구현
        private byte timeMonthPeak; // 배열로 구현
        private byte timePeak; // 배열로 구현        
        private int goalWatt;
        private int forecastWatt;
        private int baseWatt;
        private int currentWatt;
        private int prevPeakWatt;
        private int dayPeakWatt;
        private int monthPeakWatt;
        private int peakWatt;
        
//          InputStatus1: Byte;
//          InputStatus2: Byte;
//          ControlStatus: array[0..31] of Byte;
//          CommStatus: array[0..31] of Byte;
//          InternetStatus: Byte;
//
//          PulseSignal: Byte;
//          SyncSignal: Byte;
//          DmsSignal: Byte;
//          SignalReserve: Byte;
//
//          BamsCommStatus: array[0..3] of Byte;
//          BamsControlStatus: array[0..3] of Byte;
//          BamsControlResult: array[0..3] of Byte;
//          ForecastWattTime: Byte;
//          AlarmLevelCondition: Byte;
//          ScheduleGoalWatt: Byte;
//          LoadCondition: Byte;
//          Reserve: array[0..11] of Byte;
        private byte inputStatus1;
        private byte inputStatus2;
        private byte controlStatus; // 배열로 구현
        private byte commStatus; // 배열로 구현
        private byte internetStatus;
        private byte pulseSignal;
        private byte syncSignal;
        private byte dmsSignal;
        private byte signalReserve;
        private byte bamsCommStatus; // 배열로 구현
        private byte bamsControlStatus; // 배열로 구현
        private byte bamsControlResult; // 배열로 구현
        private byte forecastWattTime;
        private byte alarmLevelCondition;
        private byte scheduleGoalWatt;
        private byte loadCondition;
        private byte reserve; // 배열로 구현

        public int getEstSec() {
            return estSec;
        }

        public void setEstSec(int estSec) {
            this.estSec = estSec;
        }

        public int getDcDateTime() {
            return dcDateTime;
        }

        public void setDcDateTime(int dcDateTime) {
            this.dcDateTime = dcDateTime;
        }

        public int getDlcDateTime() {
            return dlcDateTime;
        }

        public void setDlcDateTime(int dlcDateTime) {
            this.dlcDateTime = dlcDateTime;
        }

        public byte getAlarmLevel() {
            return alarmLevel;
        }

        public void setAlarmLevel(byte alarmLevel) {
            this.alarmLevel = alarmLevel;
        }

        public byte getTimeDayPeak() {
            return timeDayPeak;
        }

        public void setTimeDayPeak(byte timeDayPeak) {
            this.timeDayPeak = timeDayPeak;
        }

        public byte getTimeMonthPeak() {
            return timeMonthPeak;
        }

        public void setTimeMonthPeak(byte timeMonthPeak) {
            this.timeMonthPeak = timeMonthPeak;
        }

        public byte getTimePeak() {
            return timePeak;
        }

        public void setTimePeak(byte timePeak) {
            this.timePeak = timePeak;
        }

        public int getGoalWatt() {
            return goalWatt;
        }

        public void setGoalWatt(int goalWatt) {
            this.goalWatt = goalWatt;
        }

        public int getForecastWatt() {
            return forecastWatt;
        }

        public void setForecastWatt(int forecastWatt) {
            this.forecastWatt = forecastWatt;
        }

        public int getBaseWatt() {
            return baseWatt;
        }

        public void setBaseWatt(int baseWatt) {
            this.baseWatt = baseWatt;
        }

        public int getCurrentWatt() {
            return currentWatt;
        }

        public void setCurrentWatt(int currentWatt) {
            this.currentWatt = currentWatt;
        }

        public int getPrevPeakWatt() {
            return prevPeakWatt;
        }

        public void setPrevPeakWatt(int prevPeakWatt) {
            this.prevPeakWatt = prevPeakWatt;
        }

        public int getDayPeakWatt() {
            return dayPeakWatt;
        }

        public void setDayPeakWatt(int dayPeakWatt) {
            this.dayPeakWatt = dayPeakWatt;
        }

        public int getMonthPeakWatt() {
            return monthPeakWatt;
        }

        public void setMonthPeakWatt(int monthPeakWatt) {
            this.monthPeakWatt = monthPeakWatt;
        }

        public int getPeakWatt() {
            return peakWatt;
        }

        public void setPeakWatt(int peakWatt) {
            this.peakWatt = peakWatt;
        }

        public byte getInputStatus1() {
            return inputStatus1;
        }

        public void setInputStatus1(byte inputStatus1) {
            this.inputStatus1 = inputStatus1;
        }

        public byte getInputStatus2() {
            return inputStatus2;
        }

        public void setInputStatus2(byte inputStatus2) {
            this.inputStatus2 = inputStatus2;
        }

        public byte getControlStatus() {
            return controlStatus;
        }

        public void setControlStatus(byte controlStatus) {
            this.controlStatus = controlStatus;
        }

        public byte getCommStatus() {
            return commStatus;
        }

        public void setCommStatus(byte commStatus) {
            this.commStatus = commStatus;
        }

        public byte getInternetStatus() {
            return internetStatus;
        }

        public void setInternetStatus(byte internetStatus) {
            this.internetStatus = internetStatus;
        }

        public byte getPulseSignal() {
            return pulseSignal;
        }

        public void setPulseSignal(byte pulseSignal) {
            this.pulseSignal = pulseSignal;
        }

        public byte getSyncSignal() {
            return syncSignal;
        }

        public void setSyncSignal(byte syncSignal) {
            this.syncSignal = syncSignal;
        }

        public byte getDmsSignal() {
            return dmsSignal;
        }

        public void setDmsSignal(byte dmsSignal) {
            this.dmsSignal = dmsSignal;
        }

        public byte getSignalReserve() {
            return signalReserve;
        }

        public void setSignalReserve(byte signalReserve) {
            this.signalReserve = signalReserve;
        }

        public byte getBamsCommStatus() {
            return bamsCommStatus;
        }

        public void setBamsCommStatus(byte bamsCommStatus) {
            this.bamsCommStatus = bamsCommStatus;
        }

        public byte getBamsControlStatus() {
            return bamsControlStatus;
        }

        public void setBamsControlStatus(byte bamsControlStatus) {
            this.bamsControlStatus = bamsControlStatus;
        }

        public byte getBamsControlResult() {
            return bamsControlResult;
        }

        public void setBamsControlResult(byte bamsControlResult) {
            this.bamsControlResult = bamsControlResult;
        }

        public byte getForecastWattTime() {
            return forecastWattTime;
        }

        public void setForecastWattTime(byte forecastWattTime) {
            this.forecastWattTime = forecastWattTime;
        }

        public byte getAlarmLevelCondition() {
            return alarmLevelCondition;
        }

        public void setAlarmLevelCondition(byte alarmLevelCondition) {
            this.alarmLevelCondition = alarmLevelCondition;
        }

        public byte getScheduleGoalWatt() {
            return scheduleGoalWatt;
        }

        public void setScheduleGoalWatt(byte scheduleGoalWatt) {
            this.scheduleGoalWatt = scheduleGoalWatt;
        }

        public byte getLoadCondition() {
            return loadCondition;
        }

        public void setLoadCondition(byte loadCondition) {
            this.loadCondition = loadCondition;
        }

        public byte getReserve() {
            return reserve;
        }

        public void setReserve(byte reserve) {
            this.reserve = reserve;
        }
    }
    
    public class DcSetting {
//          GoalNormal     : Integer;
//          GoalValue      : TGoalValue;
//          GoalHolidayValue: TGoalValue;
//          Season         : array[0..11] of Byte;
//          LoadTimeZone   : array[0..23] of TLoadTimeZone;
//          LoadHolidayTimeZone: array[0..23] of TLoadTimeZone;
//          WattPrice      : Byte;
//          Pulse          : Integer;
//          CPT            : Integer;
//          PulseForm      : Byte;
//          SafeRate       : Byte;
//          ControlOn      : Word;
//          ControlOff     : Word;
//          FirstDelay     : Word;
//          AlarmDelay     : Word;
//          ForceTime      : Word;
//          AlarmCutTime   : Word;
//
//          LoadCount      : Byte;
//          ControlMethod  : Byte;
//          ControlMode    : Byte;
//          ControlApp     : Byte;
        
        private int goalWatt;
        private int goalValue; // 배열로구현
        private int goalHolidayValue; // 배열로 구현
        private byte seasonValue; // 배열로 구현
        private byte loadTimeZone; // 배열로 구현
        private byte loadHolidayTimeZone; // 배열로 구현
        private byte wattPrice;
        private int pulse;
        private int pct;
        private byte pulseForm;
        private byte safeRate;
        private int controlOn;
        private int controlOff;
        private int firstDelay;
        private int alarmDelay;
        private int forceTime;
        private int alarmCutTime;
        private byte loadCount;
        private byte controlMethod;
        private byte controlMode;
        private byte controlApp;
//          DCID           : Cardinal;
//          UserID         : Cardinal;
//          RemoteIP       : array[0..3] of Byte;
//          RemotePort     : Word;
//          TxInterval     : Word;
//          Speed          : Word;
//          ComTimeout     : Byte;
//
//          LoadActivity   : array[0..31] of Byte;
//          LoadAgree      : array[0..31] of Byte;
//
//          IsLoadNumbering  : Byte;
//          LoadNumbering  : array[0..31] of Byte;
//          LoadGroup      : array[0..31] of Byte;
//          AgreeWatt      : Integer;
//          InspectDay     : Byte;
//          AlarmAllow     : Byte;
//          ComplexCount   : Byte;

        private int dcId;
        private int userId;
        private byte remoteIp; //배열로 구현
        private int remotePort;
        private int txInterval;
        private int comSpeed;
        private byte comTimeout;
        private byte loadActivity; //배열로 구현
        private byte loadAgree; // 배열로 구현
        private byte isLoadNumbering;
        private byte loadNumbering; // 배열로 구현
        private byte loadGroup; // 배열로 구현
        private int agreeWatt;
        private byte inspectDay;
        private byte alarmAllow;
        private byte complexCount;

        public int getGoalWatt() {
            return goalWatt;
        }

        public void setGoalWatt(int goalWatt) {
            this.goalWatt = goalWatt;
        }

        public int getGoalValue() {
            return goalValue;
        }

        public void setGoalValue(int goalValue) {
            this.goalValue = goalValue;
        }

        public int getGoalHolidayValue() {
            return goalHolidayValue;
        }

        public void setGoalHolidayValue(int goalHolidayValue) {
            this.goalHolidayValue = goalHolidayValue;
        }

        public byte getSeasonValue() {
            return seasonValue;
        }

        public void setSeasonValue(byte seasonValue) {
            this.seasonValue = seasonValue;
        }

        public byte getLoadTimeZone() {
            return loadTimeZone;
        }

        public void setLoadTimeZone(byte loadTimeZone) {
            this.loadTimeZone = loadTimeZone;
        }

        public byte getLoadHolidayTimeZone() {
            return loadHolidayTimeZone;
        }

        public void setLoadHolidayTimeZone(byte loadHolidayTimeZone) {
            this.loadHolidayTimeZone = loadHolidayTimeZone;
        }

        public byte getWattPrice() {
            return wattPrice;
        }

        public void setWattPrice(byte wattPrice) {
            this.wattPrice = wattPrice;
        }

        public int getPulse() {
            return pulse;
        }

        public void setPulse(int pulse) {
            this.pulse = pulse;
        }

        public int getPct() {
            return pct;
        }

        public void setPct(int pct) {
            this.pct = pct;
        }

        public byte getPulseForm() {
            return pulseForm;
        }

        public void setPulseForm(byte pulseForm) {
            this.pulseForm = pulseForm;
        }

        public byte getSafeRate() {
            return safeRate;
        }

        public void setSafeRate(byte safeRate) {
            this.safeRate = safeRate;
        }

        public int getControlOn() {
            return controlOn;
        }

        public void setControlOn(int controlOn) {
            this.controlOn = controlOn;
        }

        public int getControlOff() {
            return controlOff;
        }

        public void setControlOff(int controlOff) {
            this.controlOff = controlOff;
        }

        public int getFirstDelay() {
            return firstDelay;
        }

        public void setFirstDelay(int firstDelay) {
            this.firstDelay = firstDelay;
        }

        public int getAlarmDelay() {
            return alarmDelay;
        }

        public void setAlarmDelay(int alarmDelay) {
            this.alarmDelay = alarmDelay;
        }

        public int getForceTime() {
            return forceTime;
        }

        public void setForceTime(int forceTime) {
            this.forceTime = forceTime;
        }

        public int getAlarmCutTime() {
            return alarmCutTime;
        }

        public void setAlarmCutTime(int alarmCutTime) {
            this.alarmCutTime = alarmCutTime;
        }

        public byte getLoadCount() {
            return loadCount;
        }

        public void setLoadCount(byte loadCount) {
            this.loadCount = loadCount;
        }

        public byte getControlMethod() {
            return controlMethod;
        }

        public void setControlMethod(byte controlMethod) {
            this.controlMethod = controlMethod;
        }

        public byte getControlMode() {
            return controlMode;
        }

        public void setControlMode(byte controlMode) {
            this.controlMode = controlMode;
        }

        public byte getControlApp() {
            return controlApp;
        }

        public void setControlApp(byte controlApp) {
            this.controlApp = controlApp;
        }

        public int getDcId() {
            return dcId;
        }

        public void setDcId(int dcId) {
            this.dcId = dcId;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public byte getRemoteIp() {
            return remoteIp;
        }

        public void setRemoteIp(byte remoteIp) {
            this.remoteIp = remoteIp;
        }

        public int getRemotePort() {
            return remotePort;
        }

        public void setRemotePort(int remotePort) {
            this.remotePort = remotePort;
        }

        public int getTxInterval() {
            return txInterval;
        }

        public void setTxInterval(int txInterval) {
            this.txInterval = txInterval;
        }

        public int getComSpeed() {
            return comSpeed;
        }

        public void setComSpeed(int comSpeed) {
            this.comSpeed = comSpeed;
        }

        public byte getComTimeout() {
            return comTimeout;
        }

        public void setComTimeout(byte comTimeout) {
            this.comTimeout = comTimeout;
        }

        public byte getLoadActivity() {
            return loadActivity;
        }

        public void setLoadActivity(byte loadActivity) {
            this.loadActivity = loadActivity;
        }

        public byte getLoadAgree() {
            return loadAgree;
        }

        public void setLoadAgree(byte loadAgree) {
            this.loadAgree = loadAgree;
        }

        public byte getIsLoadNumbering() {
            return isLoadNumbering;
        }

        public void setIsLoadNumbering(byte isLoadNumbering) {
            this.isLoadNumbering = isLoadNumbering;
        }

        public byte getLoadNumbering() {
            return loadNumbering;
        }

        public void setLoadNumbering(byte loadNumbering) {
            this.loadNumbering = loadNumbering;
        }

        public byte getLoadGroup() {
            return loadGroup;
        }

        public void setLoadGroup(byte loadGroup) {
            this.loadGroup = loadGroup;
        }

        public int getAgreeWatt() {
            return agreeWatt;
        }

        public void setAgreeWatt(int agreeWatt) {
            this.agreeWatt = agreeWatt;
        }

        public byte getInspectDay() {
            return inspectDay;
        }

        public void setInspectDay(byte inspectDay) {
            this.inspectDay = inspectDay;
        }

        public byte getAlarmAllow() {
            return alarmAllow;
        }

        public void setAlarmAllow(byte alarmAllow) {
            this.alarmAllow = alarmAllow;
        }

        public byte getComplexCount() {
            return complexCount;
        }

        public void setComplexCount(byte complexCount) {
            this.complexCount = complexCount;
        }
    }
}

