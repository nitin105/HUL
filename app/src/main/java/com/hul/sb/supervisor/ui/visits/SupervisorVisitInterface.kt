package com.hul.sb.supervisor.ui.visits

import com.hul.data.ProjectInfo

/**
 * Created by Nitin Chorge on 04-09-2024.
 */
interface SupervisorVisitInterface {
    fun redirectToSchoolActivity(projectInfo: ProjectInfo, visitsForSchoolId: ArrayList<ProjectInfo>)

    fun goToMap(projectInfo: ProjectInfo)
}