package com.example.jeff.android_job_workmanager_alpha6_crash

import com.evernote.android.job.Job
import com.evernote.android.job.JobCreator

class EvernoteJobCreator : JobCreator {

  override fun create(tag: String): Job? {
    return when (tag) {
      MyJob.TAG -> MyJob()
      else -> null
    }
  }
}
