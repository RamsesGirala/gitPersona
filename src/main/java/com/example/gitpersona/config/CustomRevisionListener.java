package com.example.gitpersona.config;

import org.hibernate.envers.RevisionListener;
import com.example.gitpersona.audit.Revision;

public class CustomRevisionListener implements RevisionListener {

    public void newRevision(Object revisionEntity) {
        final Revision revision = (Revision) revisionEntity;
    }
}
