#ifndef CASSAIL_LOG_H
#define CASSAIL_LOG_H

#include <android/log.h>

#define TRACE_CRIT(...) __android_log_print(ANDROID_LOG_ERROR,"CM", ##__VA_ARGS__)
#define TRACE_ERR(...) __android_log_print(ANDROID_LOG_ERROR,"CM", ##__VA_ARGS__)
#define TRACE_WARN(...) __android_log_print(ANDROID_LOG_WARN,"CM", ##__VA_ARGS__)
#define TRACE_INFO(...) __android_log_print(ANDROID_LOG_INFO,"CM", ##__VA_ARGS__)
#define TRACE_DBG(...) __android_log_print(ANDROID_LOG_DEBUG,"CM", ##__VA_ARGS__)
#define TRACE_DTL(...) __android_log_print(ANDROID_LOG_VERBOSE,"CM", ##__VA_ARGS__)
#define TRACE_ASSERT(...) __android_log_print(ANDROID_LOG_ERROR,"CM", ##__VA_ARGS__)
#define TRACE_FUN_EXIT(...) __android_log_print(ANDROID_LOG_DEBUG,"CM", "EXIT-------->")
#define TRACE_FUN_ENTER(...) __android_log_print(ANDROID_LOG_DEBUG,"CM", "ENTER-------->")

#define TRACE_STAT_CRIT(...) __android_log_print(ANDROID_LOG_ERROR,"CM_STAT", ##__VA_ARGS__)
#define TRACE_STAT_ERR(...) __android_log_print(ANDROID_LOG_ERROR,"CM_STAT", ##__VA_ARGS__)
#define TRACE_STAT_WARN(...) __android_log_print(ANDROID_LOG_WARN,"CM_STAT", ##__VA_ARGS__)
#define TRACE_STAT_INFO(...) __android_log_print(ANDROID_LOG_INFO,"CM_STAT", ##__VA_ARGS__)
#define TRACE_STAT_DBG(...) __android_log_print(ANDROID_LOG_DEBUG,"CM_STAT", ##__VA_ARGS__)
#define TRACE_STAT_DTL(...) __android_log_print(ANDROID_LOG_VERBOSE,"CM_STAT", ##__VA_ARGS__)
#endif