package com.pontoporponto.jenkins.plugins;
import java.io.File;
import java.util.List;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.model.building.ModelSource;
import org.apache.maven.project.ProjectBuilder;
import org.apache.maven.project.ProjectBuildingException;
import org.apache.maven.project.ProjectBuildingRequest;
import org.apache.maven.project.ProjectBuildingResult;

public class MultipleRepositories implements ProjectBuilder {
    public MultipleRepositories() {
    }

	@Override
	public ProjectBuildingResult build(File projectFile, ProjectBuildingRequest request)
			throws ProjectBuildingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProjectBuildingResult build(Artifact projectArtifact, ProjectBuildingRequest request)
			throws ProjectBuildingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProjectBuildingResult build(Artifact projectArtifact, boolean allowStubModel, ProjectBuildingRequest request)
			throws ProjectBuildingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProjectBuildingResult build(ModelSource modelSource, ProjectBuildingRequest request)
			throws ProjectBuildingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProjectBuildingResult> build(List<File> pomFiles, boolean recursive, ProjectBuildingRequest request)
			throws ProjectBuildingException {
		// TODO Auto-generated method stub
		return null;
	}
}
