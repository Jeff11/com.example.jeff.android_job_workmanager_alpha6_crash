package com.example.jeff.android_job_workmanager_alpha6_crash

import android.app.Activity
import android.os.Bundle
import com.evernote.android.job.JobManager

class MainActivity : Activity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    JobManager.create(this).addJobCreator(EvernoteJobCreator())

    MyJob.scheduleJob()
  }
}
