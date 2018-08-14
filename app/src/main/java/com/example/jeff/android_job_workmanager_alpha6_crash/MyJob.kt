package com.example.jeff.android_job_workmanager_alpha6_crash

import com.evernote.android.job.Job
import com.evernote.android.job.JobRequest

class MyJob : Job() {

  override fun onRunJob(params: Params): Result {
    return Result.SUCCESS
  }

  companion object {
    const val TAG = "my_tag"

    fun scheduleJob() {
      JobRequest.Builder(TAG)
          .setExecutionWindow(1, 1000)
          .build()
          .scheduleAsync()
    }
  }
}
